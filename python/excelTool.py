import pandas as pd
from openpyxl import load_workbook


def currencyTableFormat(country:str):
    df = pd.read_csv('python\doc\各国货币换算表(1).csv')
    print(df)




"""
读取货币csv文件，转化成规定格式

"""
def currencyTable():
    df = pd.read_csv("python\doc\各国货币换算表(1).csv")

    for index,row in df.iteritems():

        df[index] = '|'.join([ str(item) for item in row])    

    newdf = df.transpose()
    print(newdf.iloc[:,:1])
    newdf = newdf.iloc[:,:1]


    newdf.to_excel(r"python\doc\CurrencyTable.xlsx")
    #df.to_excel(r"python\doc\CurrencyLvMapping.xlsx")


def excelAddsheet(dataframe,excelwriter,sheetname):
    

    dataframe.to_excel(excel_writer = excelwriter,sheet_name = sheetname, index = 0)
    #excelwriter.save() #save()后打开excel文件报错：文件损坏是否修复



def fashionCompensation():
    dataExcel = r"python\doc\20221026-购买皮肤记录.xlsx"
    df = pd.read_excel(dataExcel,sheet_name="Sheet1")
    writer = pd.ExcelWriter(r'python\doc\fashionCompensation.xlsx')

    nrows = df.shape[0]
    ncols = df.columns.size
    print("Max Rows: "+str(nrows))
    print("Max Columns: "+str(ncols))
    newDf = df[['itemid','roleid','createtime']]

    df2 = pd.read_excel(dataExcel,sheet_name="Sheet2")
    
    df3 = pd.merge(newDf,df2, on = 'itemid')

    excelAddsheet(newDf,writer,"原数据")
    excelAddsheet(df2,writer,"皮肤价格映射表")
    excelAddsheet(df3,writer,"含源晶数据")
  
    df800 = filterValue(df3,800)
    print(df800)

    df760 = filterValue(df3,760)
    print(df760)

    df1360 = filterValue(df3,1360)
    print(df1360)

    df360 = filterValue(df3,360)
    print(df360)


    excelAddsheet(df800,writer,"800源晶数据")
    excelAddsheet(df760,writer,"760源晶数据")
    excelAddsheet(df1360,writer,"1360源晶数据")
    excelAddsheet(df360,writer,"360源晶数据")


    print('------------------------------------------------------------------------')
    result800 = pd.DataFrame(list(mailStringGenerator(df800,1000).items()),columns = ['key','result'])
    print(result800)

    result760 = pd.DataFrame(list(mailStringGenerator(df760,1000).items()),columns = ['key','result'])
    print(result760)

    result1360 = pd.DataFrame(list(mailStringGenerator(df1360,1000).items()),columns = ['key','result'])
    print(result1360)

    result360 = pd.DataFrame(list(mailStringGenerator(df360,1000).items()),columns = ['key','result'])
    print(result360)


    excelAddsheet(result800,writer,"result800")
    excelAddsheet(result760,writer,"result760")
    excelAddsheet(result1360,writer,"result1360")
    excelAddsheet(result360,writer,"result360")
    writer.close()

def filterValue(df,value:int):
    filteredValue = df[df['value']==value]
    groupedValue = filteredValue.groupby('roleid').sum('value')
    groupedValue.reset_index(level=0,inplace=True)
    return groupedValue[['value','roleid','createtime']].sort_values(by='value',ascending=True)


def mailStringGenerator(dataframe,num):
    valueType = dataframe.value.unique()
    result = {}
    for x in valueType:
        for y in range(0,dataframe[dataframe['value']== x ].shape[0],num):
            str1 = dataframe[dataframe['value']== x ].sort_index(ascending=True)[y:y+num]['roleid'].unique()
            strlist = ','.join([str(v) for v in str1])
            result[str(x)+"-"+str(y)] = strlist
    return result


if __name__ == "__main__":
    #fashionCompensation()
    currencyTable()
# python main function
"""
if run in this file, __name__ = __main__
if run in other's file, __name__ = main(the name of this file)
"""

import PowerSeries

print(__name__)


def main():
    print("this function is from main function")
    #print(PowerSeries.doPowerSeries(0.5))

if __name__ == "__main__":
    main()
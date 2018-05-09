# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from __future__ import print_function
__author__ = "ellix"
__date__ = "$9-May-2018 6:35:24 PM$"

def convertToTraditional(part1, part2): 
    zero = ""
    hour = int(float(part1))
    minute = int(float(part2))

    if minute > 60:
        minute = minute - 60
        hour = hour + 1
    if minute < 10:
        zero = "0"
    if hour == 24:
        hour = 00;
    if hour >= 12 and hour < 24:
        if hour > 12:
            hour = hour - 12
        print(hour, ":", zero, minute, " pm", sep = '')
    elif hour >= 0 and hour < 12:
        print(hour, ":", zero, minute, " am", sep = '')
    else:
        print("You probably have a typo.")

def convertToStandardTime(part1, part2, part3):
    zeroh, zerom = "", ""
    hour = int(float(part1))
    minute = int(float(part2))
    if part3.lower is ("pm") and int(float(part1)) < 12:
            hour = hour + 12
    if minute > 60:
        minute = minute - 60
        hour = hour + 1
    if hour <= 24:
        if hour < 10:
            zeroh = "0"
        if minute < 10:
            zerom = "0"
        print(zeroh, hour, ":", zerom, minute, sep = '')
    elif hour > 24:
        print("You probably have a typo.")

if __name__ == "__main__":

    choice, colon, m, part1, part2, part3 = "", "", "", "", "", ""
    print("Type in a time")
    choice = input().replace(" ", "")
    colon = choice.index(":")
    if len(choice) < 6:
        part1 = choice[: colon]
        part2 = choice[colon+1:]
        convertToTraditional(part1, part2);
    else:
        part1 = choice[: colon]
        part2 = choice[colon+1:colon + 3]
        m = choice.index("m");
        part3 = choice[m-1:m+1]
        convertToStandardTime(part1, part2, part3);



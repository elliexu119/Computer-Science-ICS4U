# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
from __future__ import print_function
from object import object

__author__ = "ellix"
__date__ = "$9-May-2018 6:35:24 PM$"


if __name__ == "__main__":

    arr = [10, 11, 12]
    for x in range (0, len(arr)):
        print (arr[x])
    
    a = object()
    a.egg()
    print ("glue" , a.glue(2), end = "", flush = True)
    
    x = 1
    while True:
        print ("py")
        x += 1
        if x == 100:
            print ("thon")
            break
    



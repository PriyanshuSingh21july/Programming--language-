Mydic={
               "name":"Priyanshu",
               "rollno":126,
               "cgpa":[8.81,7.74,7.35,7.27],
               "Anotherdic":{'name':'vivek'}

}
#Acess key of Dictionary
print(Mydic.keys())

#Acess value of dictionary
print(Mydic.values())


#Acess iteam of dictionary
print(Mydic.items())

#Upadate dictionary
updatedic={
               "Age":20,
               "rollno":"0187CS211126"

}
Mydic.update(updatedic)
print(Mydic)

#Get method
print("Get :",Mydic.get('name'))
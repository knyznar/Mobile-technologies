 
import Foundation
// 1
var str = "Hello, playground"
var intNumber = 12
var doubleNumber = 12.1
 
 // 2
let str2: String = "Hello, constant"
let intNumber2: Int = 13
let doubleNumber2: Double = 13.1
 
 // 3 
var concatenated = str + " " + String(intNumber2)
var concatenated2 = "str \(intNumber2)"
 
 // 4
var array = ["qwe", "asd", "zxc"]
var dictionary = ["qwe":1, "asd":2, "zxc":3]
 
 // 5
array.append("rty")
dictionary["fgh"] = 4
 
 // 6
var lottoResults = ["29-11-14": [4,5,21,30,31,49], "27-11-14": [5,8,10,19,23,40]]
var emptyDictionary = [Character: Int]()
 
 // 7-8
var alphabet = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"]
var iterator = 1
for i in alphabet {
    emptyDictionary[Character(i)] = iterator
    iterator += 1
}
 
// 9. printowanie wynikow losowania lotto
for (date, results) in lottoResults {
    print("Losowanie z dnia \(date):")
    for res in results {
        print("- \(res)")
    }
}
 
// 10. najwiekszy wspolny dzielnik
func nwd(a:Int, b:Int) -> Int {
  if a == b {
    return a
  }
  else if a > b {
      return nwd(a:a-b,b:b)
    }
  else {
    return nwd(a:a,b:b-a)
  }
}

print (nwd(a: 12, b: 6))
 
//11. kopia nwd
func nwdTuple(a: Int, b: Int) -> (Int,Int,Int){
 var result = 0
    if a == b {
      result = a
    }
    else {
      if a > b {
        result = nwd(a:a-b,b:b)
      }
      else {
        result = nwd(a:a,b:b-a)
      }
    }
  return (result, a/result, b/result)
}
 
print (nwdTuple(a:4,b:16))
 
//12.
func cipher(str: String, f: (Character) -> Character) -> String {
    var uppercased = str.uppercased()
    var result = ""
    for c in uppercased {
      result += String(f(c))
    }  
    return result
}

func codeChar(c: Character) -> Character {
  switch c {
  case "G":
    return("A")
  case "D":
    return("E")
  case "R":
    return("Y")
  case "P":
    return("O")
  case "L":
    return("U")
  case "K":
    return("I")
  case "I":
    return("K")
  case "U":
    return("L")
  case "O":
    return("P")
  case "Y":
    return("R")
  case "E":
    return("D")
  case "A":
    return("G")
  default:
      return c
  }
}

print(cipher(str: "gdrplkaeyouiqwzx", f: codeChar))

//13
var changedResults: [Int] = []

lottoResults.map({lottoRes in 
  lottoRes.value.map({number in
    if(number % 2 == 0){
      changedResults.append(0)
    } else{
      changedResults.append(1)
    }    
  })
})
  print(changedResults)

// 14
class NamedObject {
  var Name: String = "Name"
  func describe() -> String {
    return "Name is \(Name)"
  }
}

// 15
class Sphere: NamedObject {
  var radius: Double = 0.0
  init(Name: String, radius: Double) {
    super.init()
    self.Name = Name
    self.radius = radius
  }

  var sphereVolume: Double{
    get{
      return 4/3 * pow(radius, 3) * Double.pi 
    }
    set{
      radius = pow(((newValue * 3/4)/(Double.pi)), (1.0/3.0))
    }
  }
  override func describe() -> String{
    return "Sphere \(Name)\'s radius is \(radius)"
  }
}
var sphere = Sphere(Name: "Sphere",radius: 5.0)
print(sphere.sphereVolume)
print(sphere.describe())
sphere.sphereVolume = 12
print(sphere.describe())

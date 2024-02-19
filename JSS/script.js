



               /* java script   code    */

               /*
console.log("helllo");
alert("hellohhg");
*/

//console.dir(document.body);
//console.log(window);
document.body.style.backgroundColor = "red"; /*  change html css code usinh jss dynamically     */

console.log("heloo world");
console.dir(document.body);
console.log(document.head);
console.log(document.body);
console.log("First node",document.body.childNodes[1]);

/*  Acess data for manupulation*/
let heading=document.getElementById("heading");
console.dir(heading);

/*      return html collection           */
let hello=document.getElementsByClassName("hello");
console.dir(hello);
console.log(hello);

/*                                                   */
let p=document.getElementsByClassName("p");
console.dir(p);
console.log(p);


/*                        */
let element= document.querySelectorAll("p");
console.dir(element);


/*   property of jss              */
// mike 10-3 2015 
// calculate all the possible combinations of gear ratios from the FrontList and RearList 
// create a list from these values
// then sort the list
// and print the list in order
// Wed 11 Mar 2015 00:39:16 EST 
// into geany 23.03.2015
// into IntelliJ on Win7 8/6/2020

import scala.collection.mutable.ListBuffer

object BikeGearsSR{
def main(args: Array[String]) {
var a = 0;
var FrontList = List(22.0, 32.0, 42.0);  // make float so division is 
										//	automatically organised
var RearList = List(26, 23, 21, 19, 17, 15, 13, 12);  // Steve Red bike 
// var RatioList = Nil;
// for loop execution with multiple filters
 var ratios = new ListBuffer[Double]()

for( a <- FrontList; b <- RearList ){
// if a != 3;

// if a < 8 ;
 // if a >=2){
 // RatioList = RatioList .::: a/b
	ratios += a/b 

	println( "Gear ratio of F/R: "   + a, +b,
	a/b) ;
}

println( "\n");

	//println( RatioList );
	//println( ratios );   // unsorted
	val ratiosList = ratios.toList
// println("spacer line");
	for ( a <- ratiosList.sorted ) {
	// keep as example printf ("ratios %4.2f "+ a);
		printf("ratio %f \n", a);
	}
	
	println("Steve's Red Bike 2");
// printf( ratiosList.sorted(3) );  // want to show the ratio of smallest to largest available
}  // end main
}  // end object
// }

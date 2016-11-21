
class TraficLight   {
public static void whatLightIsNow(double x){
double n=x;
double aGreen=0;double bGreen=3;
int i=1;
while(i<=10){

//if(i==1){
// if((n>0 && n<=bGreen)){
//	System.out.println("зеленый");
////	break;
// }   
//}else{
if((n>=aGreen && n<=bGreen)){
	System.out.println("зеленый");
//	break;}
}
aGreen=bGreen+3; bGreen=aGreen+3;
System.out.println("["+aGreen+","+bGreen+"]");
//}
i++;
}
}
public static void main(String args[]){
whatLightIsNow(2.5);

}
}
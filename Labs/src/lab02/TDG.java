package lab02;

class TDG{String s(){String o="",q=" lecture about my workload\n";String[]r={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth","","Two problem sets","Three rough drafts","Four hundred emails","Five Shakespeare plays!","Six chapters' reading","Seven lab reports","Eight examinations","Nine performance skits","Ten Practice Problems","Eleven vocab lists","Twelve lunch detentions"};int i,n;for(i=0;i<12;i++){o+="On the "+r[i]+" day of high school, my teacher gave to me\n";r[12]=(i>0?"And a":"A")+q;for(n=i;n>=0; n--){o+=r[n+12]+"\n";}}return(o);}}
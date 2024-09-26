public class swap {
    public String swaplasttwo (String str){
        return str.substring(0,str.length()-2)+str.substring(str.length()-1)
                +str.substring(str.length()-2,str.length()-1);


    }
}

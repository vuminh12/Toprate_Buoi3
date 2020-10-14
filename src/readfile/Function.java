    package readfile;
    import java.util.*;

    //divide word
    public class Function {


        HashMap<String,Integer> hashmap1 = new HashMap<String,Integer>();
       // HashMap<Integer,String> hashmap2 = new HashMap<Integer,String>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();

        // devide word in 1 line
        public  void Split(String line){
            String[] word = line.split("[ ,.\"]");

            for(String w:word){
                list2.add(w);
           }
            for(int i=0;i<list2.size();i++){
                if(list2.get(i)==" "||list2.get(i)==","|| list2.get(i)=="."|| list2.get(i)=="\""){
                    list2.remove(i);
                }
            }
        }


        // so sanh va dem co bao nhieu so tu/tu
        public  void Compare(){
            int count =1;

            for(int i=0;i<list2.size()-1;i++){
                for(int j=i+1;j<list2.size();j++){
                if(list2.get(i).equals(list2.get(j))) {
                    count++;
                    list2.remove(j);
                  }
                }
                list1.add(count);
                hashmap1.put(list2.get(i),list1.get(i));
                }
            }
    
        // dem so tu khac nhau trong 1 file
        public void Count(){
            for (int i=0;i<list2.size();i++){
                System.out.println(list2.size());
            }
        }

        // sap xep  thanh danh sach theo tan so xuat hien cua tu
        public void Sort() {

            Collections.sort(list2);
            Collections.sort(list1);

            HashMap<String, Integer> sortedMap = new HashMap<>();

            Iterator<Integer> valueIt = list1.iterator();
            while (valueIt.hasNext()) {
                Integer val = valueIt.next();
                Iterator<String> keyIt = list2.iterator();

                while (keyIt.hasNext()) {
                    String key = keyIt.next();
                    Integer comp1 = hashmap1.get(key);
                    Integer comp2 = val;

                    if (comp1>comp2) {
                        keyIt.remove();
                        sortedMap.put(key, val);
                        break;
                    }
                }
            }
        }

    }
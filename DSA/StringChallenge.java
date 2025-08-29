public class StringChallenge {

        public static String StringChallenge(String str) {
            
            StringBuilder result = new StringBuilder();
            
            String varOcg = "";
            
            
            String[] words = str.split("[^a-zA-Z]+");
            
          
            for (int i = 0; i < words.length; i++) {
                if (i == 0) {
                  
                    varOcg = words[i].toLowerCase();
                } else {
                    
                    varOcg += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
                }
            }

            result.append(varOcg);
            
        
            String challengeToken = "ayruht49";
            String finalResult = new StringBuilder(varOcg).reverse().toString() + ":" + new StringBuilder(challengeToken).reverse().toString();
            

            return finalResult;
        }
    
        public static void main(String[] args) {

            System.out.println(StringChallenge("cats AND*Dogs-are Awesome"));
            System.out.println(StringChallenge("a b c d-e-f%g"));
        }
    }
    


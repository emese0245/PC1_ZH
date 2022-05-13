import java.util.ArrayList;

public class Chef {
    public Chef(){

    }

    protected ArrayList<String[]> recipe = new ArrayList<>();
    public void newRecipe(String recipe, String price) {
        String[] price = new String[2];
        price[0]=recipe;
        price[1]=" -";
        this .add(price);

    }

    public void removeRecipe (String subject)
    {
        for (int i = 0; i < recipe.size(); i++) {
            if(Object.equals(recipe.get(i)[0], subject))
            {
                recipe.remove(i);
            }
        }
    }

    public String getMenu(){
        String result = "";

        if(recipe.size() != 0){
            for(int i = 0; i < recipe.size(); i++){

                if(recipe.get(i)[1]== " -"){
                    result += recipe.get(i)[0]+ "" + recipe.get(i)[1];
                    if(i != recipe.size() - 1) result += "\r\n";
                }
                else {
                    result += recipe.get(i)[0]+ " " + recipe.get(i)[1];
                    if(i != recipe.size() - 1) result += "\r\n";
                }
            }
        }
        return result;
    }


}

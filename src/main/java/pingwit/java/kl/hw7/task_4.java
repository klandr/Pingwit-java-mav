package hw7;

//-
public class task_4 {
    public static void main(String[] args) {
        String found_1_Text = "alert";
        String found_2_Text = "add";
        String found_3_Text = "good";
        String found_4_Text = "plan";

        String isText = "While major gameplay components are already in place and functioning " +
                "players help is needed to add some of the smaller features and content." +
                "Of course polishing the overall experience is important at the same time." +
                "Game has been extensively tested in closed group, but it is always important" +
                "to hear fresh suggestions" +
                "from larger crowd that come from various gaming backgrounds." +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        //if (isText.contains(found_1_Text = true)) {
        //System.out.println(();
        //}
        System.out.println(isText.contains(found_1_Text));
        System.out.println(isText.contains(found_2_Text));
        System.out.println(isText.contains(found_3_Text));
        System.out.println(isText.contains(found_4_Text));

        //  charAt(i)
        // System.out.println(isText.length());
        System.out.println(isText);

        String[] split = isText.split(" ");
        String [] massifFromIsText = new String[split.length];

        //for (int i =0;i< split.length;i++){
        //    massifFromIsText[i] = Integer.valueOf(split[i]);
        //}


    }
}
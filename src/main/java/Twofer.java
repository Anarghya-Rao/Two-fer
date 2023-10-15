public class Twofer {
    public String twofer(String name) {
        String resultString = "One for %s, one for me.";

        if(name == null)
            return resultString.formatted("you");
        else
            return resultString.formatted(name);
    }
}

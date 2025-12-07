public class Sign
{
    private String message;
    private int width;

    public Sign(String msg, int w)
    {
        message = msg;
        width = w;
    }

    public int numberOfLines()
    {
        if (message.length() == 0) return 0;
        if (message.length() % width == 0) return message.length() / width;
        return message.length() / width + 1;
    }

    public String getLines()
    {
        if (message.length() == 0) return null;

        String result = "";
        int i = 0;

        while (i < message.length())
        {
            int end = i + width;
            if (end > message.length()) end = message.length();

            result += message.substring(i, end);
            if (end < message.length()) result += ";";

            i = end;
        }
        return result;
    }
}

package org.csystem.app.text.findincurly;

public class FindTextInCurly {
    public String text;
    public String result;
    public boolean isValid;

    public FindTextInCurly(String txt)
    {
        text = txt;
        result = text;
        isValid = true;
    }

    public void parse()
    {
        for (;;) {
            int open = result.indexOf('{');
            int close = result.lastIndexOf('}');

            if (open == -1 && close != -1 || open > close) {
                isValid = false;
                break;
            }

            if (close == -1)
                break;

            result = result.substring(open + 1, close);
        }
    }
}

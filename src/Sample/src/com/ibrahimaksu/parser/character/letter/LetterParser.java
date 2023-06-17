package com.ibrahimaksu.parser.character.letter;

import org.csystem.parser.character.CharacterParser;
import org.csystem.parser.character.ICharacterSource;

public class LetterParser extends CharacterParser {
    private String m_letters;

    public LetterParser(ICharacterSource characterSource)
    {
        super(characterSource);
        m_letters = "";
    }

    public String getLetters()
    {
        return m_letters;
    }

    public void parse()
    {
        int ch;
        StringBuilder sb = new StringBuilder();

        while ((ch = characterSource.nextChar()) != -1)
            if (Character.isLetter(ch))
                sb.append((char)ch);

        m_letters = sb.toString();
    }
}

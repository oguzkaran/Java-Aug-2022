package org.csystem.app.io.file.data;

import java.io.Serial;
import java.io.Serializable;

public class Sensor implements Serializable {
    @Serial
    private static final long serialVersionUID = -1L;
    private int m_id;
    private String m_name;

    public Sensor(int id, String name)
    {
        m_id = id;
        m_name = name;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }


    public String toString()
    {
        return String.format("[%d]%s", m_id, m_name);
    }
}

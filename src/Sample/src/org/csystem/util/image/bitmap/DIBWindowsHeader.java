package org.csystem.util.image.bitmap;

public class DIBWindowsHeader extends BitmapHeaderCommon {
    private int m_sizeOfHeader;
    private int m_width;
    private int m_height;
    //...
    private int m_horizontalResolution;
    private int m_verticalResolution;

    public int getSizeOfHeader()
    {
        return m_sizeOfHeader;
    }

    public void setSizeOfHeader(int sizeOfHeader)
    {
        m_sizeOfHeader = sizeOfHeader;
    }

    public int getWidth()
    {
        return m_width;
    }

    public void setWidth(int width)
    {
        m_width = width;
    }

    public int getHeight()
    {
        return m_height;
    }

    public void setHeight(int height)
    {
        m_height = height;
    }

    public int getHorizontalResolution()
    {
        return m_horizontalResolution;
    }

    public void setHorizontalResolution(int horizontalResolution)
    {
        m_horizontalResolution = horizontalResolution;
    }

    public int getVerticalResolution()
    {
        return m_verticalResolution;
    }

    public void setVerticalResolution(int verticalResolution)
    {
        m_verticalResolution = verticalResolution;
    }
}

/*
0E	14	4	the size of this header, in bytes (40)
12	18	4	the bitmap width in pixels (signed integer)
16	22	4	the bitmap height in pixels (signed integer)
1A	26	2	the number of color planes (must be 1)
1C	28	2	the number of bits per pixel, which is the color depth of the image. Typical values are 1, 4, 8, 16, 24 and 32.
1E	30	4	the compression method being used. See the next table for a list of possible values
22	34	4	the image size. This is the size of the raw bitmap data; a dummy 0 can be given for BI_RGB bitmaps.
26	38	4	the horizontal resolution of the image. (pixel per metre, signed integer)
2A	42	4	the vertical resolution of the image. (pixel per metre, signed integer)
2E	46	4	the number of colors in the color palette, or 0 to default to 2n
32	50	4	the number of important colors used, or 0 when every color is important; generally ignored

 */
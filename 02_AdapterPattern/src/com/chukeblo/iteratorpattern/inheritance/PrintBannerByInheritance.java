package com.chukeblo.iteratorpattern.inheritance;

import com.chukeblo.iteratorpattern.Banner;

public class PrintBannerByInheritance extends Banner implements IPrint {
    public PrintBannerByInheritance(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

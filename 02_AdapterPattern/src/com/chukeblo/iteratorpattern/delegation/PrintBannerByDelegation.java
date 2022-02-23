package com.chukeblo.iteratorpattern.delegation;

import com.chukeblo.iteratorpattern.Banner;

public class PrintBannerByDelegation extends AbstractPrint {
    private Banner banner;

    public PrintBannerByDelegation(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

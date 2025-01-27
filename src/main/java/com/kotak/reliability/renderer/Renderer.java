package com.kotak.reliability.renderer;

import com.kotak.reliability.model.PageBlock;

public interface Renderer {

    public void renderLogic(PageBlock pageConfig, Object data);
}

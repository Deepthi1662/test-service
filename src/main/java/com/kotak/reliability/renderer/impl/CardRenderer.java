package com.kotak.reliability.renderer.impl;

import com.kotak.reliability.model.PageBlock;
import com.kotak.reliability.model.RendererType;
import com.kotak.reliability.renderer.Renderer;
import com.kotak.reliability.renderer.RendererFactory;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CardRenderer implements Renderer {

    @PostConstruct
    public void register() {
        RendererFactory.register(RendererType.CONTAINER, this);
    }

    @Override
    public void renderLogic(PageBlock pageConfig, Object data) {

    }
}

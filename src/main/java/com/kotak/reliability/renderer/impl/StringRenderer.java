package com.kotak.reliability.renderer.impl;

import com.kotak.reliability.model.PageBlock;
import com.kotak.reliability.model.RendererType;
import com.kotak.reliability.renderer.Renderer;
import com.kotak.reliability.renderer.RendererFactory;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StringRenderer implements Renderer {

    @PostConstruct
    public void register() {
        RendererFactory.register(RendererType.STRING, this);
    }

    @Override
    public void renderLogic(PageBlock pageConfig, Object data) {
        Map<String, String> convertedData = (Map<String, String>) data;


    }
}

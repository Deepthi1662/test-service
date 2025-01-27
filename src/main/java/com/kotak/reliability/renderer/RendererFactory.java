package com.kotak.reliability.renderer;

import com.kotak.reliability.model.RendererType;

import java.util.HashMap;
import java.util.Map;

public class RendererFactory {

    private static Map<RendererType, Renderer> rendererMap =
            new HashMap<RendererType, Renderer>();

    public static void register(RendererType type, Renderer renderer) {
        rendererMap.put(type, renderer);
    }

    public static Renderer getRenderer(RendererType rendererType) {
        return rendererMap.get(rendererType);
    }
}

package com.jagex;

/**
 * Created by Krimsonowl on 8/12/2017.
 */
public class StaticMedia {
    public static SpriteToolkit[] nameIconSprites;

    public static void loadSprites(GraphicsToolkit graphicsToolkit, Js5FileSystem JS5_SPRITE) {
        Sprite[] imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class74.anInt692 * -1217066055, 0);
        Class160.aClass57Array1646 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            Class160.aClass57Array1646[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, -355151363 * Class74.anInt694, 0);
        Class401.aClass57Array6561 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            Class401.aClass57Array6561[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, 1838189665 * Class143.anInt1558, 0);
        StaticMethods.aClass57Array5334 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            StaticMethods.aClass57Array5334[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class400.anInt5223 * 1862609057, 0);
        StaticMethods.aClass57Array5351 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            StaticMethods.aClass57Array5351[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, -81301735 * Class74.anInt693, 0);
        HintIcon.arrowTypeSprites = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            HintIcon.arrowTypeSprites[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class74.anInt696 * -2088314757, 0);
        Class74.arrowSprites = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int index = 0; index < imageDefinitionLoaders.length; index++)
            Class74.arrowSprites[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, StaticMethods.anInt7398 * -1199789537, 0);
        Class234.aClass57Array2598 = new SpriteToolkit[imageDefinitionLoaders.length];
        int i_21_ = 25;
        for (int index = 0; index < imageDefinitionLoaders.length; index++) {
            imageDefinitionLoaders[index].offsetColour(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
            Class234.aClass57Array2598[index] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[index], true);
        }
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, StaticMethods.anInt6842 * -2107184677, 0);
        StaticMethods.aClass57Array6861 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int i_23_ = 0; i_23_ < imageDefinitionLoaders.length; i_23_++)
            StaticMethods.aClass57Array6861[i_23_] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[i_23_], true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class494.anInt6092 * -1624054445, 0);
        SubIncommingPacket.aClass57Array2349 = new SpriteToolkit[imageDefinitionLoaders.length];
        i_21_ = 12;
        for (int i_24_ = 0; i_24_ < imageDefinitionLoaders.length; i_24_++) {
            imageDefinitionLoaders[i_24_].offsetColour(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
            SubIncommingPacket.aClass57Array2349[i_24_] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[i_24_], true);
        }
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class74.anInt697 * 1200791325, 0);
        nameIconSprites = new SpriteToolkit[imageDefinitionLoaders.length];
        i_21_ = 12;
        for (int i_25_ = 0; i_25_ < imageDefinitionLoaders.length; i_25_++) {
            imageDefinitionLoaders[i_25_].offsetColour(-i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0), -i_21_ + (int) (Math.random() * (double) i_21_ * 2.0));
            nameIconSprites[i_25_] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[i_25_], true);
        }
        StaticMethods.activeSpriteToolkit = graphicsToolkit.createSpriteToolkit(Sprite.loadFirst(JS5_SPRITE, (StaticMethods.anInt6667 * 1359711467), 0), true);
        Graphics.aClass57_573 = graphicsToolkit.createSpriteToolkit(Sprite.loadFirst(JS5_SPRITE, ((Class128_Sub1.anInt8557) * -1848350339), 0), true);
        imageDefinitionLoaders = Sprite.load(JS5_SPRITE, Class298_Sub24_Sub1.anInt9281 * -328242359, 0);
        Class250.aClass57Array2766 = new SpriteToolkit[imageDefinitionLoaders.length];
        for (int i_26_ = 0; i_26_ < imageDefinitionLoaders.length; i_26_++)
            Class250.aClass57Array2766[i_26_] = graphicsToolkit.createSpriteToolkit(imageDefinitionLoaders[i_26_], true);
    }

    public static void loadFonts(GraphicsToolkit graphicsToolkit) {
        if (GameClient.menuOpen)
            StaticMethods.method6011(graphicsToolkit);
        else
            StaticMethods.method314();
    }
}

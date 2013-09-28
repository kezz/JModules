package me.kieranwallbanks.jmodules;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ModuleTests {
    protected static boolean enabled = false;

    @Test
    public void mainModuleTest() throws Exception {
        ModuleManager manager = new ModuleManager();
        manager.addModulesFromPackage("me.kieranwallbanks.jmodules", ClassLoader.getSystemClassLoader());

        manager.enableModules();
        manager.disableModules();

        assertTrue(enabled);
    }

}

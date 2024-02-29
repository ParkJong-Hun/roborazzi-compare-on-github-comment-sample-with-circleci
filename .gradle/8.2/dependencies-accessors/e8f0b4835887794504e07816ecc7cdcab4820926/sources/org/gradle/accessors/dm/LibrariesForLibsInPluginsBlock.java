package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ActivityLibraryAccessors laccForActivityLibraryAccessors = new ActivityLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoreLibraryAccessors laccForCoreLibraryAccessors = new CoreLibraryAccessors(owner);
    private final EspressoLibraryAccessors laccForEspressoLibraryAccessors = new EspressoLibraryAccessors(owner);
    private final LifecycleLibraryAccessors laccForLifecycleLibraryAccessors = new LifecycleLibraryAccessors(owner);
    private final UiLibraryAccessors laccForUiLibraryAccessors = new UiLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("junit");
    }

        /**
         * Creates a dependency provider for material3 (androidx.compose.material3:material3)
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getMaterial3() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("material3");
    }

        /**
         * Creates a dependency provider for robolectric (org.robolectric:robolectric)
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getRobolectric() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("robolectric");
    }

        /**
         * Creates a dependency provider for roborazzi (io.github.takahirom.roborazzi:roborazzi)
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getRoborazzi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("roborazzi");
    }

    /**
     * Returns the group of libraries at activity
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ActivityLibraryAccessors getActivity() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForActivityLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public AndroidxLibraryAccessors getAndroidx() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ComposeLibraryAccessors getCompose() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at core
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public CoreLibraryAccessors getCore() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForCoreLibraryAccessors;
    }

    /**
     * Returns the group of libraries at espresso
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public EspressoLibraryAccessors getEspresso() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForEspressoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at lifecycle
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public LifecycleLibraryAccessors getLifecycle() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForLifecycleLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ui
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public UiLibraryAccessors getUi() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForUiLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ActivityLibraryAccessors extends SubDependencyFactory {

        public ActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCompose() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("activity.compose");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxTestLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestExtLibraryAccessors laccForAndroidxTestExtLibraryAccessors = new AndroidxTestExtLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.ext
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public AndroidxTestExtLibraryAccessors getExt() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForAndroidxTestExtLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class AndroidxTestExtLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("androidx.test.ext.junit");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComposeLibraryAccessors extends SubDependencyFactory {

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (androidx.compose:compose-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("compose.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class CoreLibraryAccessors extends SubDependencyFactory {

        public CoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getKtx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("core.ktx");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EspressoLibraryAccessors extends SubDependencyFactory {

        public EspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("espresso.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LifecycleLibraryAccessors extends SubDependencyFactory {
        private final LifecycleRuntimeLibraryAccessors laccForLifecycleRuntimeLibraryAccessors = new LifecycleRuntimeLibraryAccessors(owner);

        public LifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at lifecycle.runtime
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public LifecycleRuntimeLibraryAccessors getRuntime() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForLifecycleRuntimeLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class LifecycleRuntimeLibraryAccessors extends SubDependencyFactory {

        public LifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getKtx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("lifecycle.runtime.ktx");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class UiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final UiTestLibraryAccessors laccForUiTestLibraryAccessors = new UiTestLibraryAccessors(owner);
        private final UiToolingLibraryAccessors laccForUiToolingLibraryAccessors = new UiToolingLibraryAccessors(owner);

        public UiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui");
        }

            /**
             * Creates a dependency provider for graphics (androidx.compose.ui:ui-graphics)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getGraphics() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui.graphics");
        }

        /**
         * Returns the group of libraries at ui.test
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public UiTestLibraryAccessors getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForUiTestLibraryAccessors;
        }

        /**
         * Returns the group of libraries at ui.tooling
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public UiToolingLibraryAccessors getTooling() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForUiToolingLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class UiTestLibraryAccessors extends SubDependencyFactory {

        public UiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJunit4() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui.test.junit4");
        }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getManifest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui.test.manifest");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class UiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public UiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui.tooling");
        }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getPreview() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ui.tooling.preview");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ActivityVersionAccessors vaccForActivityVersionAccessors = new ActivityVersionAccessors(providers, config);
        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final CoreVersionAccessors vaccForCoreVersionAccessors = new CoreVersionAccessors(providers, config);
        private final EspressoVersionAccessors vaccForEspressoVersionAccessors = new EspressoVersionAccessors(providers, config);
        private final LifecycleVersionAccessors vaccForLifecycleVersionAccessors = new LifecycleVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: robolectric (4.11.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRobolectric() { return getVersion("robolectric"); }

            /**
             * Returns the version associated to this alias: roborazzi (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoborazzi() { return getVersion("roborazzi"); }

        /**
         * Returns the group of versions at versions.activity
         */
        public ActivityVersionAccessors getActivity() {
            return vaccForActivityVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.core
         */
        public CoreVersionAccessors getCore() {
            return vaccForCoreVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.espresso
         */
        public EspressoVersionAccessors getEspresso() {
            return vaccForEspressoVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.lifecycle
         */
        public LifecycleVersionAccessors getLifecycle() {
            return vaccForLifecycleVersionAccessors;
        }

    }

    public static class ActivityVersionAccessors extends VersionFactory  {

        public ActivityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: activity.compose (1.8.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("activity.compose"); }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() {
            return vaccForAndroidxTestVersionAccessors;
        }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        private final AndroidxTestExtVersionAccessors vaccForAndroidxTestExtVersionAccessors = new AndroidxTestExtVersionAccessors(providers, config);
        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx.test.ext
         */
        public AndroidxTestExtVersionAccessors getExt() {
            return vaccForAndroidxTestExtVersionAccessors;
        }

    }

    public static class AndroidxTestExtVersionAccessors extends VersionFactory  {

        public AndroidxTestExtVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.ext.junit (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("androidx.test.ext.junit"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.bom (2023.08.00)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBom() { return getVersion("compose.bom"); }

    }

    public static class CoreVersionAccessors extends VersionFactory  {

        public CoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: core.ktx (1.12.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("core.ktx"); }

    }

    public static class EspressoVersionAccessors extends VersionFactory  {

        public EspressoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: espresso.core (3.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("espresso.core"); }

    }

    public static class LifecycleVersionAccessors extends VersionFactory  {

        private final LifecycleRuntimeVersionAccessors vaccForLifecycleRuntimeVersionAccessors = new LifecycleRuntimeVersionAccessors(providers, config);
        public LifecycleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.lifecycle.runtime
         */
        public LifecycleRuntimeVersionAccessors getRuntime() {
            return vaccForLifecycleRuntimeVersionAccessors;
        }

    }

    public static class LifecycleRuntimeVersionAccessors extends VersionFactory  {

        public LifecycleRuntimeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: lifecycle.runtime.ktx (2.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtx() { return getVersion("lifecycle.runtime.ktx"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final RoborazziPluginAccessors paccForRoborazziPluginAccessors = new RoborazziPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApplication to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

            /**
             * Creates a plugin provider for kotlinAndroid to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

        /**
         * Returns the group of plugins at plugins.roborazzi
         */
        public RoborazziPluginAccessors getRoborazzi() {
            return paccForRoborazziPluginAccessors;
        }

    }

    public static class RoborazziPluginAccessors extends PluginFactory {

        public RoborazziPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for roborazzi.plugin to the plugin id 'io.github.takahirom.roborazzi'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("roborazzi.plugin"); }

    }

}

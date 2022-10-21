运行说明:

Operating instructions:

1. idea 应用执行需要配置 Add VM option(--module-path "C:\Program Files\JetBrains\javafx-sdk-19\lib" --add-modules=javafx.base,javafx.controls,javafx.fxml,javafx.graphics,javafx.media,javafx.swing,javafx.web) , 运行OK

1. The idea application execution needs to configure the Add VM option (-- module path "C: Program Files JetBrains javafx sdk-19 lib" -- add modules=javafx. base, javafx. controls, javafx. fxml, javafx. graphics, javafx. media, javafx. swing, javafx. web), and run OK

2. mvn spring-boot:run , 运行OK

2. mvn spring boot: run, run OK

3. java -jar xxxx.jar, 运行失败, 打包失败

3. java -jar xxxx. Jar, running failed, packaging failed

C:\Program Files\JetBrains\javafx-sdk-19\lib为javafx19 sdk路径, 在spring-boot-maven-plugin jvmArguments 修改

C： \程序文件\JetBrains\javafx-sdk-19\lib为javafx19 sdk路径, 在spring boot maven插件jvmArguments修改
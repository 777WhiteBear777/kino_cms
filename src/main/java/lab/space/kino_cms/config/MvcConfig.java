package lab.space.kino_cms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //Добавление пути к загруженным фото
        registry.addResourceHandler("/files/**")
                .addResourceLocations("file:///" + Paths.get("files").toFile().getAbsolutePath() + "/");
    }
}
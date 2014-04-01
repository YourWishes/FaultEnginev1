varying vec3 normal;
varying vec3 lightDir;

uniform vec4 color;

uniform bool textured;
uniform sampler2D texture;

void main () {
    float intensity = 1.0;
    
    if(textured) {
        vec4 tColor = texture2D(texture, gl_TexCoord[0].st);
        color = tColor * color;
    }
    
    vec3 n = normalize(normal);
    intensity = dot(vec3(lightDir),n);

    if (intensity > 0.95)
            color = vec4(color * 1);
    else if (intensity > 0.5)
            color = vec4(color * 0.75);
    else if (intensity > 0.25)
            color = vec4(color * 0.5);
    else
            color = vec4(color * 0.25);

    gl_FragColor = color;
}
varying vec3 normal;
varying vec3 lightDir;

uniform vec4 color;

uniform bool textured;
uniform sampler2D texture;

void main () {
    float intensity = 1.0;
    vec4 tColor;
    vec4 oColor = color;

    if(textured) {
        tColor = texture2D(texture, gl_TexCoord[0].st);
        color = tColor * color;
    }
    
    vec3 n = normalize(normal);
    intensity = dot(vec3(lightDir.xyz),n);

    if (intensity > 0.99)
            color = vec4(color * 1);
    else if (intensity > 0.65)
            color = vec4(color * 0.75);
    else if (intensity > 0.25)
            color = vec4(color * 0.5);
    else
            color = vec4(color * 0.15);

    color.a = oColor.a;
    if(textured) {
        color.a *= tColor.a;
    }

    gl_FragColor = color;
}
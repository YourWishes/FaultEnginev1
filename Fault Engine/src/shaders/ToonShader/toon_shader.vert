varying vec3 normal;
varying vec3 lightDir;

uniform bool textured;

void main() {
    vec4 p0 = gl_ModelViewMatrix * gl_Vertex;
    if(textured) gl_TexCoord[0] = gl_MultiTexCoord0;
    gl_Position = gl_ProjectionMatrix * p0;
    lightDir = normalize(vec3(gl_LightSource[0].position-p0));
    normal = gl_NormalMatrix * gl_Normal;
}

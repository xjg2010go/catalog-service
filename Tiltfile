custom_build(
    ref = 'catalog-service',
    command = './gradlew bootBuildImage --imageName $EXPECTED_REF',
    deps = ['build.gradle', 'src']
)

k8s_yaml(kustomize('k8s'))

k8s_resource('catalog-service', port_forwards=['9001'])
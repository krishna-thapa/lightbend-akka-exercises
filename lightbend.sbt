resolvers in ThisBuild += "lightbend-commercial-mvn" at
        "https://repo.lightbend.com/pass/RiKwu6yb3zHEPTuj_ZnocJU-rRh7WuP40lt2zN_2vqgp05ni/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
        url("https://repo.lightbend.com/pass/RiKwu6yb3zHEPTuj_ZnocJU-rRh7WuP40lt2zN_2vqgp05ni/commercial-releases"))(Resolver.ivyStylePatterns)
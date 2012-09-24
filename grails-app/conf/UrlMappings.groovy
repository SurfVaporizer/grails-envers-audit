class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/auditCheck/index"(view: 'auditCheck/index')

        "/login/$action?"(controller: "login")
        "/logout/$action?"(controller: "logout")

        "/"(view:"/index")
		"500"(view:'/error')
	}
}

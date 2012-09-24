class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/auditCheck/index"(view: 'auditCheck/index')
		"/"(view:"/index")
		"500"(view:'/error')
	}
}

Ext.application({
    name: 'Play',

    appFolder: 'public/app',

    controllers: ['Usuarios'],
    
    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                    xtype: 'usuariolist'
                }
            ]
        });
    }
	
});
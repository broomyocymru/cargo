require 'sinatra'

set :static, true
set :public_folder, "static"
set :views, "views"

background = ENV['custom_background_colour'] || 'white'
foreground = ENV['custom_foreground_colour'] || 'black'
set :var_foreground, foreground
set :var_background, background

get '/' do
  erb :index, :locals => {'timestamp' => Time.now.getutc}
end


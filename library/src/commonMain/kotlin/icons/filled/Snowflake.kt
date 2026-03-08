package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Snowflake: ImageVector
    get() {
        if (_Snowflake != null) {
            return _Snowflake!!
        }
        _Snowflake = ImageVector.Builder(
            name = "Filled.Snowflake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.425f, 2.217f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.39f, 1.423f)
                lineToRelative(-0.069f, 0.075f)
                lineTo(13f, 5.42f)
                verticalLineTo(8f)
                horizontalLineToRelative(0.022f)
                lineToRelative(0.127f, 0.004f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.457f, 0.104f)
                curveToRelative(0.165f, 0.068f, 0.297f, 0.16f, 0.403f, 0.25f)
                lineToRelative(0.096f, 0.091f)
                lineToRelative(0.777f, 0.777f)
                lineToRelative(2.467f, -1.393f)
                lineToRelative(0.64f, -2.33f)
                lineToRelative(0.032f, -0.097f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.897f, 0.626f)
                lineToRelative(-0.482f, 1.756f)
                lineToRelative(1.817f, 0.477f)
                lineToRelative(0.098f, 0.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.504f, 1.926f)
                lineToRelative(-0.1f, -0.022f)
                lineToRelative(-2.405f, -0.63f)
                lineToRelative(-2.345f, 1.324f)
                verticalLineToRelative(0.012f)
                lineToRelative(0.003f, 0.074f)
                verticalLineToRelative(2.043f)
                lineToRelative(-0.002f, 0.055f)
                lineToRelative(-0.002f, 0.03f)
                lineToRelative(2.346f, 1.323f)
                lineToRelative(2.405f, -0.63f)
                lineToRelative(0.1f, -0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.406f, 1.955f)
                lineToRelative(-1.817f, 0.476f)
                lineToRelative(0.482f, 1.757f)
                lineToRelative(0.021f, 0.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.918f, 0.526f)
                lineToRelative(-0.032f, -0.098f)
                lineToRelative(-0.64f, -2.33f)
                lineToRelative(-2.467f, -1.393f)
                lineToRelative(-0.777f, 0.778f)
                curveToRelative(-0.117f, 0.118f, -0.28f, 0.25f, -0.5f, 0.34f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.457f, 0.105f)
                lineToRelative(-0.126f, 0.004f)
                horizontalLineTo(13f)
                verticalLineToRelative(2.578f)
                lineToRelative(1.746f, 1.707f)
                lineToRelative(0.07f, 0.075f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.391f, 1.423f)
                lineToRelative(-0.077f, -0.068f)
                lineTo(12f, 20.398f)
                lineToRelative(-1.348f, 1.317f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.398f, -1.43f)
                lineTo(11f, 18.578f)
                verticalLineTo(16f)
                horizontalLineToRelative(-0.021f)
                curveToRelative(-0.167f, 0f, -0.375f, -0.02f, -0.594f, -0.112f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.397f, -0.25f)
                lineToRelative(-0.093f, -0.087f)
                lineToRelative(-0.778f, -0.778f)
                lineToRelative(-2.467f, 1.393f)
                lineToRelative(-0.64f, 2.33f)
                lineToRelative(-0.03f, 0.098f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.898f, -0.626f)
                lineToRelative(0.482f, -1.757f)
                lineToRelative(-1.817f, -0.476f)
                lineToRelative(-0.098f, -0.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.504f, -1.926f)
                lineToRelative(0.1f, 0.022f)
                lineToRelative(2.404f, 0.629f)
                lineToRelative(2.345f, -1.324f)
                lineTo(8f, 13.021f)
                verticalLineToRelative(-2.043f)
                lineToRelative(0.002f, -0.073f)
                lineToRelative(0.001f, -0.012f)
                lineToRelative(-2.346f, -1.324f)
                lineToRelative(-2.404f, 0.63f)
                lineToRelative(-0.1f, 0.022f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.406f, -1.956f)
                lineToRelative(1.817f, -0.477f)
                lineToRelative(-0.482f, -1.756f)
                lineToRelative(-0.021f, -0.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.919f, -0.526f)
                lineToRelative(0.03f, 0.098f)
                lineToRelative(0.64f, 2.329f)
                lineToRelative(2.467f, 1.393f)
                lineToRelative(0.778f, -0.777f)
                lineToRelative(0.096f, -0.09f)
                arcTo(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.979f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(5.42f)
                lineTo(9.254f, 3.716f)
                lineToRelative(-0.07f, -0.075f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.391f, -1.423f)
                lineToRelative(0.077f, 0.068f)
                lineTo(12f, 3.602f)
                lineToRelative(1.348f, -1.317f)
                close()
            }
        }.build()

        return _Snowflake!!
    }

@Suppress("ObjectPropertyName")
private var _Snowflake: ImageVector? = null

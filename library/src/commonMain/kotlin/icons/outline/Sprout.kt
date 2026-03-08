package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Sprout: ImageVector
    get() {
        if (_Sprout != null) {
            return _Sprout!!
        }
        _Sprout = ImageVector.Builder(
            name = "Outline.Sprout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.229f, 9.466f)
                curveToRelative(-0.905f, 1.173f, -2.519f, 1.188f, -3.622f, 0.21f)
                curveToRelative(-0.752f, -0.6f, -1.147f, -2.406f, -1.327f, -3.546f)
                curveToRelative(-0.086f, -0.545f, 0.287f, -1.035f, 0.818f, -1.078f)
                curveToRelative(1.131f, -0.091f, 2.966f, -0.13f, 3.714f, 0.473f)
                curveToRelative(1.171f, 0.865f, 1.297f, 2.779f, 0.417f, 3.941f)
                moveToRelative(0f, 0f)
                curveTo(10.971f, 11.122f, 12f, 16.851f, 12f, 16.851f)
                moveToRelative(1.921f, -5.336f)
                curveToRelative(-0.791f, -1.027f, -0.496f, -2.49f, 0.538f, -3.236f)
                curveToRelative(0.63f, -0.507f, 2.14f, -0.495f, 3.135f, -0.423f)
                curveToRelative(0.531f, 0.04f, 0.904f, 0.53f, 0.814f, 1.075f)
                curveToRelative(-0.166f, 1f, -0.51f, 2.48f, -1.142f, 2.983f)
                curveToRelative(-0.968f, 0.842f, -2.551f, 0.607f, -3.345f, -0.4f)
                moveToRelative(0f, 0f)
                curveTo(12.431f, 12.972f, 12f, 16.85f, 12f, 16.85f)
                moveTo(20.5f, 19f)
                curveToRelative(-2.7f, -1.176f, -5.564f, -2.303f, -8.5f, -2.149f)
                moveToRelative(0f, 0f)
                curveToRelative(-2.936f, -0.154f, -5.8f, 0.973f, -8.5f, 2.149f)
            }
        }.build()

        return _Sprout!!
    }

@Suppress("ObjectPropertyName")
private var _Sprout: ImageVector? = null

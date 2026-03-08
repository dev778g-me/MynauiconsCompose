package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Flower2: ImageVector
    get() {
        if (_Flower2 != null) {
            return _Flower2!!
        }
        _Flower2 = ImageVector.Builder(
            name = "Outline.Flower2",
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
                moveTo(12f, 11.25f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                moveToRelative(0f, 1f)
                verticalLineToRelative(6f)
                moveToRelative(0f, 3.5f)
                curveToRelative(3.36f, 0f, 4.6f, -1.334f, 4.6f, -4f)
                curveToRelative(-3.36f, 0f, -4.6f, 1.334f, -4.6f, 4f)
                moveToRelative(0f, 0f)
                curveToRelative(-3.36f, 0f, -4.6f, -1.334f, -4.6f, -4f)
                curveToRelative(3.36f, 0f, 4.6f, 1.334f, 4.6f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.272f, 6.84f)
                reflectiveCurveTo(10f, 5.229f, 10f, 4.424f)
                curveToRelative(0f, -1.193f, 0.92f, -2.173f, 2.001f, -2.173f)
                reflectiveCurveToRelative(2.001f, 0.98f, 2.001f, 2.173f)
                curveToRelative(0f, 0.805f, -1.273f, 2.418f, -1.273f, 2.418f)
                moveToRelative(0.232f, 0.147f)
                reflectiveCurveToRelative(1.425f, -1.517f, 2.06f, -1.92f)
                curveToRelative(0.942f, -0.596f, 2.175f, -0.211f, 2.716f, 0.816f)
                curveToRelative(0.54f, 1.027f, 0.227f, 2.392f, -0.715f, 2.989f)
                curveToRelative(-0.634f, 0.402f, -2.334f, 0.498f, -2.334f, 0.498f)
                moveToRelative(0f, 0.294f)
                reflectiveCurveToRelative(1.7f, 0.096f, 2.335f, 0.498f)
                curveToRelative(0.941f, 0.597f, 1.254f, 1.961f, 0.714f, 2.989f)
                reflectiveCurveToRelative(-1.774f, 1.412f, -2.716f, 0.816f)
                curveToRelative(-0.635f, -0.403f, -2.06f, -1.92f, -2.06f, -1.92f)
                moveToRelative(-1.92f, 0f)
                reflectiveCurveToRelative(-1.425f, 1.517f, -2.06f, 1.92f)
                curveToRelative(-0.942f, 0.596f, -2.175f, 0.211f, -2.716f, -0.816f)
                curveToRelative(-0.54f, -1.027f, -0.227f, -2.392f, 0.715f, -2.989f)
                curveToRelative(0.635f, -0.402f, 2.334f, -0.498f, 2.334f, -0.498f)
                moveToRelative(0f, -0.294f)
                reflectiveCurveToRelative(-1.7f, -0.096f, -2.334f, -0.498f)
                curveToRelative(-0.942f, -0.597f, -1.255f, -1.962f, -0.715f, -2.989f)
                reflectiveCurveToRelative(1.774f, -1.412f, 2.716f, -0.816f)
                curveToRelative(0.635f, 0.403f, 2.06f, 1.92f, 2.06f, 1.92f)
            }
        }.build()

        return _Flower2!!
    }

@Suppress("ObjectPropertyName")
private var _Flower2: ImageVector? = null

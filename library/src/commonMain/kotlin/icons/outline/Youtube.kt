package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Youtube: ImageVector
    get() {
        if (_Youtube != null) {
            return _Youtube!!
        }
        _Youtube = ImageVector.Builder(
            name = "Outline.Youtube",
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
                moveTo(2f, 12f)
                curveToRelative(0f, -3.3f, 0f, -4.95f, 1.464f, -5.975f)
                curveTo(4.93f, 5f, 7.286f, 5f, 12f, 5f)
                reflectiveCurveToRelative(7.071f, 0f, 8.535f, 1.025f)
                reflectiveCurveTo(22f, 8.7f, 22f, 12f)
                reflectiveCurveToRelative(0f, 4.95f, -1.465f, 5.975f)
                curveTo(19.072f, 19f, 16.714f, 19f, 12f, 19f)
                reflectiveCurveToRelative(-7.071f, 0f, -8.536f, -1.025f)
                reflectiveCurveTo(2f, 15.3f, 2f, 12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 9.908f)
                verticalLineToRelative(4.184f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.412f, 0.408f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.228f, -0.068f)
                lineToRelative(3.175f, -2.074f)
                arcToRelative(0.405f, 0.405f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.003f, -0.678f)
                lineToRelative(-3.175f, -2.11f)
                arcToRelative(0.415f, 0.415f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.573f, 0.11f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 0.228f)
            }
        }.build()

        return _Youtube!!
    }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null

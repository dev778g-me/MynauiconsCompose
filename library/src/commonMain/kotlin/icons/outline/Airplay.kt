package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Airplay: ImageVector
    get() {
        if (_Airplay != null) {
            return _Airplay!!
        }
        _Airplay = ImageVector.Builder(
            name = "Outline.Airplay",
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
                moveTo(12.632f, 16.511f)
                curveToRelative(-0.216f, -0.284f, -0.324f, -0.426f, -0.455f, -0.477f)
                arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.354f, 0f)
                curveToRelative(-0.13f, 0.051f, -0.239f, 0.193f, -0.455f, 0.477f)
                lineToRelative(-2.363f, 3.106f)
                curveToRelative(-0.336f, 0.443f, -0.505f, 0.664f, -0.505f, 0.85f)
                curveToRelative(0f, 0.163f, 0.07f, 0.316f, 0.19f, 0.417f)
                curveToRelative(0.139f, 0.116f, 0.408f, 0.116f, 0.947f, 0.116f)
                horizontalLineToRelative(4.726f)
                curveToRelative(0.539f, 0f, 0.808f, 0f, 0.947f, -0.116f)
                arcToRelative(0.54f, 0.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.19f, -0.416f)
                curveToRelative(0f, -0.187f, -0.169f, -0.408f, -0.505f, -0.85f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.4f, 18f)
                horizontalLineToRelative(0.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(0.6f)
            }
        }.build()

        return _Airplay!!
    }

@Suppress("ObjectPropertyName")
private var _Airplay: ImageVector? = null

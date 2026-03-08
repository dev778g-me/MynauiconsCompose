package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigUp: ImageVector
    get() {
        if (_ArrowBigUp != null) {
            return _ArrowBigUp!!
        }
        _ArrowBigUp = ImageVector.Builder(
            name = "Outline.ArrowBigUp",
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
                moveTo(4.483f, 10.895f)
                curveToRelative(-0.43f, 0f, -0.645f, -0.545f, -0.34f, -0.863f)
                lineToRelative(7.516f, -6.884f)
                arcToRelative(0.467f, 0.467f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.682f, 0f)
                lineToRelative(7.517f, 6.884f)
                curveToRelative(0.304f, 0.318f, 0.088f, 0.863f, -0.341f, 0.863f)
                horizontalLineTo(15.68f)
                arcToRelative(0.495f, 0.495f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.483f, 0.506f)
                verticalLineToRelative(9.093f)
                curveToRelative(0f, 0.28f, -0.216f, 0.506f, -0.482f, 0.506f)
                horizontalLineTo(9.284f)
                arcToRelative(0.494f, 0.494f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.482f, -0.506f)
                verticalLineToRelative(-9.093f)
                arcToRelative(0.495f, 0.495f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.483f, -0.506f)
                close()
            }
        }.build()

        return _ArrowBigUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUp: ImageVector? = null

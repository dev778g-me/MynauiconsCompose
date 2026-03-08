package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterG: ImageVector
    get() {
        if (_LetterG != null) {
            return _LetterG!!
        }
        _LetterG = ImageVector.Builder(
            name = "Outline.LetterG",
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
                moveTo(13.167f, 12f)
                horizontalLineToRelative(1.458f)
                curveToRelative(0.345f, 0f, 0.625f, 0.28f, 0.625f, 0.625f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.345f, -0.28f, 0.625f, -0.625f, 0.625f)
                horizontalLineToRelative(-3.75f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15.125f)
                verticalLineToRelative(-6.25f)
                curveTo(9f, 7.839f, 9.84f, 7f, 10.875f, 7f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
            }
        }.build()

        return _LetterG!!
    }

@Suppress("ObjectPropertyName")
private var _LetterG: ImageVector? = null

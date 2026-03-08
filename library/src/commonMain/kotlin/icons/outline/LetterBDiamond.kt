package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterBDiamond: ImageVector
    get() {
        if (_LetterBDiamond != null) {
            return _LetterBDiamond!!
        }
        _LetterBDiamond = ImageVector.Builder(
            name = "Outline.LetterBDiamond",
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
                moveTo(9.5f, 12f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.671f)
                curveToRelative(2.192f, 0f, 2.5f, 3.258f, 0.456f, 4f)
                moveTo(9.5f, 12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.671f)
                curveToRelative(2.192f, 0f, 2.5f, -3.258f, 0.456f, -4f)
                moveTo(9.5f, 12f)
                horizontalLineToRelative(4.127f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.707f, 10.295f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                lineToRelative(7.588f, 7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, 0f)
                lineToRelative(7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.41f)
                lineToRelative(-7.588f, -7.588f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
                close()
            }
        }.build()

        return _LetterBDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _LetterBDiamond: ImageVector? = null

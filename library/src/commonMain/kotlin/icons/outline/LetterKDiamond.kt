package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterKDiamond: ImageVector
    get() {
        if (_LetterKDiamond != null) {
            return _LetterKDiamond!!
        }
        _LetterKDiamond = ImageVector.Builder(
            name = "Outline.LetterKDiamond",
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
                moveTo(9.75f, 8f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(0.5f)
                moveToRelative(0f, 0f)
                lineToRelative(4.5f, 4f)
                moveToRelative(-4.5f, -4f)
                lineToRelative(4.5f, -4f)
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

        return _LetterKDiamond!!
    }

@Suppress("ObjectPropertyName")
private var _LetterKDiamond: ImageVector? = null

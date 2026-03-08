package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterC: ImageVector
    get() {
        if (_LetterC != null) {
            return _LetterC!!
        }
        _LetterC = ImageVector.Builder(
            name = "Outline.LetterC",
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
                moveTo(15.5f, 9.5f)
                verticalLineToRelative(-0.312f)
                curveTo(15.5f, 7.979f, 14.52f, 7f, 13.313f, 7f)
                horizontalLineTo(10.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9.5f)
                verticalLineToRelative(5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
                horizontalLineToRelative(2.813f)
                curveToRelative(1.208f, 0f, 2.187f, -0.98f, 2.187f, -2.187f)
                verticalLineTo(14.5f)
            }
        }.build()

        return _LetterC!!
    }

@Suppress("ObjectPropertyName")
private var _LetterC: ImageVector? = null

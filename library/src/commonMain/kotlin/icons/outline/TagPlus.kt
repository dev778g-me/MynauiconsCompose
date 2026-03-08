package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TagPlus: ImageVector
    get() {
        if (_TagPlus != null) {
            return _TagPlus!!
        }
        _TagPlus = ImageVector.Builder(
            name = "Outline.TagPlus",
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
                moveTo(4.472f, 5.5f)
                horizontalLineTo(14.77f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.396f, 0.568f)
                lineToRelative(5.35f, 5.216f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.432f)
                lineToRelative(-5.35f, 5.216f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.396f, 0.568f)
                horizontalLineTo(4.472f)
                curveToRelative(-0.95f, 0f, -2.222f, -0.541f, -2.222f, -1.625f)
                verticalLineToRelative(-9.75f)
                curveTo(2.25f, 6.041f, 3.523f, 5.5f, 4.472f, 5.5f)
                moveTo(6f, 12f)
                horizontalLineToRelative(5f)
                moveTo(8.5f, 9.5f)
                verticalLineToRelative(5f)
            }
        }.build()

        return _TagPlus!!
    }

@Suppress("ObjectPropertyName")
private var _TagPlus: ImageVector? = null

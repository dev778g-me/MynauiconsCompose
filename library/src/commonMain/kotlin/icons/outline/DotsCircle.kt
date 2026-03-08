package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DotsCircle: ImageVector
    get() {
        if (_DotsCircle != null) {
            return _DotsCircle!!
        }
        _DotsCircle = ImageVector.Builder(
            name = "Outline.DotsCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                moveToRelative(-9f, 0.25f)
                verticalLineToRelative(-0.5f)
                moveToRelative(4f, 0.5f)
                verticalLineToRelative(-0.5f)
                moveToRelative(-8f, 0.5f)
                verticalLineToRelative(-0.5f)
            }
        }.build()

        return _DotsCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DotsCircle: ImageVector? = null

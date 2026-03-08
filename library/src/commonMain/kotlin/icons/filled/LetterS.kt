package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LetterS: ImageVector
    get() {
        if (_LetterS != null) {
            return _LetterS!!
        }
        _LetterS = ImageVector.Builder(
            name = "Filled.LetterS",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.25f)
                verticalLineToRelative(1.23f)
                curveToRelative(0f, 1.176f, 0.716f, 2.233f, 1.807f, 2.67f)
                lineToRelative(3.893f, 1.557f)
                curveToRelative(0.332f, 0.133f, 0.55f, 0.455f, 0.55f, 0.812f)
                verticalLineToRelative(1.231f)
                arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 16f)
                horizontalLineToRelative(-3.75f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.25f)
                verticalLineToRelative(-0.312f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(0.312f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 18f)
                horizontalLineTo(14f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineToRelative(-1.23f)
                arcToRelative(2.875f, 2.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.807f, -2.67f)
                lineToRelative(-3.893f, -1.557f)
                arcToRelative(0.875f, 0.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, -0.812f)
                verticalLineTo(8.25f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.25f)
                horizontalLineTo(14f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.25f)
                verticalLineToRelative(0.313f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(8.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                close()
            }
        }.build()

        return _LetterS!!
    }

@Suppress("ObjectPropertyName")
private var _LetterS: ImageVector? = null

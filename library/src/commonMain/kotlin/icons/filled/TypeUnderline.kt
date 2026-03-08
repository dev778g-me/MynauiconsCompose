package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.TypeUnderline: ImageVector
    get() {
        if (_TypeUnderline != null) {
            return _TypeUnderline!!
        }
        _TypeUnderline = ImageVector.Builder(
            name = "Filled.TypeUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(7.539f)
                curveToRelative(0f, 1.531f, 0.566f, 2.99f, 1.557f, 4.058f)
                curveToRelative(0.99f, 1.066f, 2.32f, 1.653f, 3.693f, 1.653f)
                reflectiveCurveToRelative(2.704f, -0.587f, 3.693f, -1.653f)
                curveToRelative(0.991f, -1.067f, 1.557f, -2.527f, 1.557f, -4.058f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(7.539f)
                curveToRelative(0f, 1.895f, -0.699f, 3.723f, -1.958f, 5.079f)
                curveToRelative(-1.26f, 1.358f, -2.983f, 2.132f, -4.792f, 2.132f)
                reflectiveCurveToRelative(-3.531f, -0.774f, -4.792f, -2.132f)
                curveToRelative(-1.26f, -1.356f, -1.958f, -3.184f, -1.958f, -5.08f)
                verticalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.25f)
                moveTo(3.25f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _TypeUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _TypeUnderline: ImageVector? = null
